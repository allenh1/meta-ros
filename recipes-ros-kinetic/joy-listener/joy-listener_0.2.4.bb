# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Translates joy msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy sensor-msgs"
SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/kinetic/joy_listener/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c8a59df6e2870ff289cd9f2972438b20"
SRC_URI[sha256sum] = "e9bd30cc98788deb6a8ca51733ee07569d541eec0c261229bd5ca627d87aecdc"
S = "${WORKDIR}/wu_ros_tools-release-kinetic-joy_listener-0.2.4-0"

inherit catkin
