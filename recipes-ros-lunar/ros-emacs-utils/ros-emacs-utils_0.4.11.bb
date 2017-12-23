# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage of Emacs utils for ROS.     Only there for simplifying the release"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin rosemacs roslisp-repl slime-ros slime-wrapper"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/lunar/ros_emacs_utils/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf0117ba83f199196326555d9e80e36b"
SRC_URI[sha256sum] = "57b88a6361ade87e2c3e543c6a45ab01eb9befc464a049c5548293d2c38ad09d"
S = "${WORKDIR}/ros_emacs_utils-release-release-lunar-ros_emacs_utils-0.4.11-0"

inherit catkin
