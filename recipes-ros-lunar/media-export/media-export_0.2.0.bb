# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Placeholder package enabling generic export of media paths."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/media_export-release/archive/release/lunar/media_export/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "07570488cd8432bb92c973bb8ec30738"
SRC_URI[sha256sum] = "7844eebcffe91baa46928e6ba28a4e4c5662d012adbadd13974a3d4139a3d395"
S = "${WORKDIR}/media_export-release-release-lunar-media_export-0.2.0-0"

inherit catkin
