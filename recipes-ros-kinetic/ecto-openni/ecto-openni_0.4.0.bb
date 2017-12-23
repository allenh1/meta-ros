# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ecto bindings for the openni sensor."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cv-bridge ecto libopenni-dev libusb-1.0-dev"
SRC_URI = "https://github.com/ros-gbp/ecto_openni-release/archive/release/kinetic/ecto_openni/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8188539f466556f244a2c199337ec7c2"
SRC_URI[sha256sum] = "3d564af70371330d97eabcf5fe0bad79f91be74227d6eb54b9dd00a3621d831c"
S = "${WORKDIR}/ecto_openni-release-release-kinetic-ecto_openni-0.4.0-0"

inherit catkin
