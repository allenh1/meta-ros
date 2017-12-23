# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A main ROS interface for developers and users of  dual-armed robot from Kawada R"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hironx-ros-bridge nextage-description roslint stereo-image-proc ueye-cam"
SRC_URI = "https://github.com/tork-a/rtmros_nextage-release/archive/release/kinetic/nextage_ros_bridge/0.8.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cc97e644d71968a0465be000bd88951c"
SRC_URI[sha256sum] = "585c4aa4af185b192868872a8c5c476544e50fe10eb561939a26076aa89433a4"
S = "${WORKDIR}/rtmros_nextage-release-release-kinetic-nextage_ros_bridge-0.8.3-0"

inherit catkin
