# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta package that contains all essential package of MoveIt!. Until Summer 2016 M"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin moveit-commander moveit-core moveit-planners moveit-plugins moveit-ros moveit-setup-assistant"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "61881d3e91e0c4315d3ea8c9ce6862d9"
SRC_URI[sha256sum] = "dd6775bd5dc538755d552120af575d81f6a78d0daec301fc67058138b3e218a8"
S = "${WORKDIR}/moveit-release-release-lunar-moveit-0.9.8-0"

inherit catkin
