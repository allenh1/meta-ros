# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Applications for NAO using the NAOqi API"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native diagnostic-msgs dynamic-reconfigure geometry-msgs humanoid-nav-msgs naoqi-bridge naoqi-bridge-msgs naoqi-driver naoqi-driver-py naoqi-pose rospy std-msgs std-srvs"
SRC_URI = "https://github.com/ros-naoqi/nao_robot-release/archive/release/kinetic/nao_apps/0.5.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c25a1d83975bba9416217dc0a623d2c3"
SRC_URI[sha256sum] = "6f2578725ddfbf17c8124bc5e7f85099e934806e63cef3a416eedec6667764f2"
S = "${WORKDIR}/nao_robot-release-release-kinetic-nao_apps-0.5.15-0"

inherit catkin
