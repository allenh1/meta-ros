# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a script that launches Emacs with Slime (the     Superior "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Public-domain"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=ceff40a4e51c0530057aab711f27c327"

DEPENDS = "catkin rosemacs roslisp sbcl slime_ros slime_wrapper"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/lunar/roslisp_repl/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ab539b49eb866fa401eedaa11088515"
SRC_URI[sha256sum] = "af1ea35d2d8e9476e2ff5e11426449203bc93de0d90f7ec20d0814ede66a6ba5"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
