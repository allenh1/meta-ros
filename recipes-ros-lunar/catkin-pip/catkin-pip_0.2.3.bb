# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkin macros to allow using pure python packages in usual catkin workspaces wit"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python python-pip"
SRC_URI = "https://github.com/pyros-dev/catkin_pip-release/archive/release/lunar/catkin_pip/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8e59e00914f017c3393538f919112815"
SRC_URI[sha256sum] = "95a6890b0dcb4ba91c776752572e33a3136710005472ebbfa8dc6ed0e1c3c8c3"
S = "${WORKDIR}/catkin_pip-release-release-lunar-catkin_pip-0.2.3-0"

inherit catkin
