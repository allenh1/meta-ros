# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package allows you to publish the state of a robot to     . Once the state "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen kdl-parser liburdfdom-headers-dev orocos-kdl rosconsole roscpp rostest rostime sensor-msgs tf tf2-kdl tf2-ros"
SRC_URI = "https://github.com/ros-gbp/robot_state_publisher-release/archive/release/lunar/robot_state_publisher/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6efb70fb8fc5a096ebbce365337df851"
SRC_URI[sha256sum] = "babe65853f10cb34f0b241fe45bf876c1992946d5855876d90298f60ccf11cec"
S = "${WORKDIR}/robot_state_publisher-release-release-lunar-robot_state_publisher-1.13.5-0"

inherit catkin
