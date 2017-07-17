# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage of Emacs utils for ROS.
    Only there for simplifying the release"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rosemacs roslisp_repl slime_ros slime_wrapper"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/lunar/ros_emacs_utils/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf0117ba83f199196326555d9e80e36b"
SRC_URI[sha256sum] = "57b88a6361ade87e2c3e543c6a45ab01eb9befc464a049c5548293d2c38ad09d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
