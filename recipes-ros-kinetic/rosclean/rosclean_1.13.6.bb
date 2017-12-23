# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosclean: cleanup filesystem resources (e.g. log files)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/kinetic/${PN}/1.13.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c470bcccb0b68e7c66e20a136a0105ec"
SRC_URI[sha256sum] = "fb5f40991b301c846105a166fe4e7a842d8e0fc8b10b602bcb586a173853df6f"
S = "${WORKDIR}/ros-release-release-kinetic-${PN}-1.13.6-0"

inherit catkin
