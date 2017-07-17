# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains standard capability interfaces, which describe common robo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin"
SRC_URI = "https://github.com/ros-gbp/std_capabilities-release/archive/release/lunar/std_capabilities/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "482da3e785b2ef935a99c40033a3af0e"
SRC_URI[sha256sum] = "a115a69db24ad2f39d126ace6833d2fd70c13eb6669175823cc4619a6afa3314"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
