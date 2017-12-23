# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-OpenRTM interfacing package for the opensource version of Kawada's Hiro/NEXT"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=0e0fd756017bccbfdb4e935c7573a4ae"

DEPENDS = "catkin-native control-msgs gnuplot hrpsys-ros-bridge mk moveit-commander openni2-launch rosbash rosbuild roslang roslib roslint rospy tf unzip"
SRC_URI = "https://github.com/tork-a/rtmros_hironx-release/archive/release/kinetic/hironx_ros_bridge/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f38ab3a87ad630ece5542e4439b7868"
SRC_URI[sha256sum] = "54cdfc9bf253256001d1ec5b18f8b01dea0dadfeb548699df44af6a3e68240a8"
S = "${WORKDIR}/rtmros_hironx-release-release-kinetic-hironx_ros_bridge-2.1.0-0"

inherit catkin
