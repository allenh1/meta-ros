# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native naoqi-bridge-msgs rospy sensor-msgs std-msgs std-srvs trajectory-msgs"
SRC_URI = "https://github.com/ros-naoqi/naoqi_bridge-release/archive/release/kinetic/naoqi_pose/0.5.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5088c169c8c089d3b10075b4ef27471"
SRC_URI[sha256sum] = "baffa6449d94b13739ccfcf17cceb9283145ab80974bc10a78088d16be178982"
S = "${WORKDIR}/naoqi_bridge-release-release-kinetic-naoqi_pose-0.5.5-0"

inherit catkin
