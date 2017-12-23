# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Placeholder package enabling generic export of media paths."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/media_export-release/archive/release/kinetic/media_export/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3f962524d2b30785ad0e9ba642caaa0"
SRC_URI[sha256sum] = "5e0eb9f4064277d11d28778f9b50391a6330c0716ee21a6bf30dac94fd8d165a"
S = "${WORKDIR}/media_export-release-release-kinetic-media_export-0.2.0-0"

inherit catkin
