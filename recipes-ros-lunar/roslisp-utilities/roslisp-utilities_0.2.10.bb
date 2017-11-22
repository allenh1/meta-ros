# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Some utility functionality to interact with ROS using roslisp."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin roslisp"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/roslisp_utilities/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "383ecaad725cc8835943725ad1f29548"
SRC_URI[sha256sum] = "fbc59bdc9b999749eca2cefd9725fd789982a2eaa907dde97d5de3252ed52422"
S = "${WORKDIR}/roslisp_common-release-release-lunar-roslisp_utilities-0.2.10-0"

inherit catkin
