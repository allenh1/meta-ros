# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The md49_serialport package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/Scheik/md49_base_controller-release/archive/release/kinetic/md49_serialport/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8da2f8797e708d87027243faba2fbb7e"
SRC_URI[sha256sum] = "425eda81e26602414b014624fb3b17f96be8952cbc22f916714ed96237306090"
S = "${WORKDIR}/md49_base_controller-release-release-kinetic-md49_serialport-0.1.4-1"

inherit catkin
