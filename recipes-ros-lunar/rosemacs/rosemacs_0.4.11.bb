# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS tools for those who live in Emacs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=41acd1437e131a0cf3aef608e88483c1"

DEPENDS = "catkin emacs"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/lunar/rosemacs/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fba12263bbfecf3bb1f43d9fb58506f8"
SRC_URI[sha256sum] = "3644c3ef3290e815e9d07cf932ba5ca5ab329df544488221e140e3506fb163ce"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
