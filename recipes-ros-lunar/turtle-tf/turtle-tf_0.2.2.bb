# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtle_tf demonstrates how to write a tf broadcaster and listener with the turtl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry-msgs roscpp rospy std-msgs tf turtlesim"
SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/lunar/turtle_tf/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b28e4992b06c2e2e7853b73f9bfd50a0"
SRC_URI[sha256sum] = "3c364ad729baace41c92583ab4216a30f9a204ab8625ae942f31ad9d5edcc3fc"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
