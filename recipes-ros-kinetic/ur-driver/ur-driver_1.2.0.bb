# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the UR5/10 arm based on the Polyscope control scheme."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native control-msgs dynamic-reconfigure python-lxml rospy sensor-msgs trajectory-msgs ur-msgs"
SRC_URI = "https://github.com/ros-industrial-release/universal_robot-release/archive/release/kinetic/ur_driver/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "473d159bcc34e599c6ae3aeecfbc2113"
SRC_URI[sha256sum] = "51322521133389b40cda2e7bddcd058618aa3b3f414853cdc217eea276dd59ff"
S = "${WORKDIR}/universal_robot-release-release-kinetic-ur_driver-1.2.0-0"

inherit catkin
