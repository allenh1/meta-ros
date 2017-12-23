# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The main purpose of the cob_twist_controller is to convert target twists into jo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cmake-modules cob-control-msgs cob-frame-tracker cob-srvs dynamic-reconfigure eigen eigen-conversions geometry-msgs kdl-conversions kdl-parser nav-msgs orocos-kdl pluginlib robot-state-publisher roscpp roslint rospy rviz sensor-msgs std-msgs tf tf-conversions topic-tools trajectory-msgs urdf visualization-msgs xacro"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_twist_controller/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1cd9d777cd5327d3460aaae95ceae7f5"
SRC_URI[sha256sum] = "3e02721791e193f077dac27d9952dd5d0bb9d4cee717f5b5cf401b16ee20c9ba"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_twist_controller-0.7.0-0"

inherit catkin
