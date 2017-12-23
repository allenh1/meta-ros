# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides .launch files and other tools for   calibrating the head-m"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native checkerboard-detector dynamic-tf-publisher freenect-stack gazebo-plugins gazebo-ros joint-state-publisher openni2-launch robot-state-publisher tf turtlebot-description urdf"
SRC_URI = "https://github.com/tork-a/rtmros_nextage-release/archive/release/kinetic/nextage_calibration/0.8.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbbc33735d38e83d023e223c8e5868d8"
SRC_URI[sha256sum] = "d6943450387bb7583ba8eddb28db684f8565d84d31aca127d28256b51de64d73"
S = "${WORKDIR}/rtmros_nextage-release-release-kinetic-nextage_calibration-0.8.3-0"

inherit catkin
