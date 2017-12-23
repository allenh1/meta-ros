# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package allows you to publish the state of a robot to     . Once the state "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen kdl-parser liburdfdom-headers-dev orocos-kdl rosconsole roscpp rostest rostime sensor-msgs tf tf2-kdl tf2-ros"
SRC_URI = "https://github.com/ros-gbp/robot_state_publisher-release/archive/release/kinetic/robot_state_publisher/1.13.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d71018454fc8028e5fa190b1f002ef1"
SRC_URI[sha256sum] = "1432c77c4f37fe90e95390c413707f43c4e9b050318f1609086b2d747ec32fe9"
S = "${WORKDIR}/robot_state_publisher-release-release-kinetic-robot_state_publisher-1.13.4-0"

inherit catkin
