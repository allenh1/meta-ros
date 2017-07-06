# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost cmake eigen pkg-config"
SRC_URI = "https://github.com/ros-gbp/ompl-release/archive/release/lunar/ompl/1.3.1-3.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb306bca5d1394a8e2a7cd8a8b6091ff"
SRC_URI[sha256sum] = "7b0a7c0818dcf5f9505cb86f493ee51b1c222a0123a4582d12f00b02c4aba8b7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
