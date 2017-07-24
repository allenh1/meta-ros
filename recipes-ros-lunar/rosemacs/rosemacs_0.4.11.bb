# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS tools for those who live in Emacs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native emacs"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/lunar/rosemacs/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fba12263bbfecf3bb1f43d9fb58506f8"
SRC_URI[sha256sum] = "3644c3ef3290e815e9d07cf932ba5ca5ab329df544488221e140e3506fb163ce"
S = "${WORKDIR}/ros_emacs_utils-release-release-lunar-rosemacs-0.4.11-0"

inherit catkin
