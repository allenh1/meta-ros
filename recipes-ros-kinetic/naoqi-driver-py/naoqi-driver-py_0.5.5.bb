# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native dynamic-reconfigure geometry-msgs humanoid-nav-msgs naoqi-bridge-msgs nav-msgs roslaunch rospy sensor-msgs std-srvs"
SRC_URI = "https://github.com/ros-naoqi/naoqi_bridge-release/archive/release/kinetic/naoqi_driver_py/0.5.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1429dc332244b4ffcd6c527d3c32f811"
SRC_URI[sha256sum] = "b783008967efa45958e1b210bf70c2a3fa4f890ef39ed636a25740bd206988f9"
S = "${WORKDIR}/naoqi_bridge-release-release-kinetic-naoqi_driver_py-0.5.5-0"

inherit catkin
