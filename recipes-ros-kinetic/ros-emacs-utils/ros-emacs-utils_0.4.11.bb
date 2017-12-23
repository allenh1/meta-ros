# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage of Emacs utils for ROS.     Only there for simplifying the release"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosemacs roslisp-repl slime-ros slime-wrapper"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/kinetic/ros_emacs_utils/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8019cea06964e5712cebb1f975979f85"
SRC_URI[sha256sum] = "5dc5654313b5a135bcd58354d18e4a544e28243578885d0327586c3b3d1c793f"
S = "${WORKDIR}/ros_emacs_utils-release-release-kinetic-ros_emacs_utils-0.4.11-0"

inherit catkin
