# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapacakge that installs all available planners for MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin moveit_planners_ompl"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_planners/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "721c10f4b11ba97633889def17a6abb9"
SRC_URI[sha256sum] = "7d6e7370a52623f22453bdd8f6fef6c3b49a2ce6a8b545627f7d8dfe94533054"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
