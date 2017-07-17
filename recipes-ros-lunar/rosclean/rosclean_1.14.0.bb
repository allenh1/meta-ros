# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosclean: cleanup filesystem resources (e.g. log files)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/rosclean/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2a5839d906200a821bebb3ac2d55d1d"
SRC_URI[sha256sum] = "3d2b804fa3c59d56b741bcc54cbbecafacbe826392f2e9e83971686daad908a2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
