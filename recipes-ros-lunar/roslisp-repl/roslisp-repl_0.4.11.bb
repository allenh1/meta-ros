# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a script that launches Emacs with Slime (the     Superior "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "public_domain"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=90cf8e14bb501c1f6d3eda81e45e438a"

DEPENDS = "catkin-native catkin rosemacs roslisp sbcl slime-ros slime-wrapper"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/lunar/roslisp_repl/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ab539b49eb866fa401eedaa11088515"
SRC_URI[sha256sum] = "af1ea35d2d8e9476e2ff5e11426449203bc93de0d90f7ec20d0814ede66a6ba5"
S = "${WORKDIR}/ros_emacs_utils-release-release-lunar-roslisp_repl-0.4.11-0"

inherit catkin
