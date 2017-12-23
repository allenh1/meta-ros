# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS nav_msgs messages.      It allows you to use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nav-msgs rtt-actionlib-msgs rtt-geometry-msgs rtt-roscomm rtt-std-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_nav_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "678b13936f52fbc2455596b4daf69e5c"
SRC_URI[sha256sum] = "1ce918dae10150f168ba4119618714de102c78470ef531db18ea47b25a983ca2"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_nav_msgs-2.9.1-0"

inherit catkin
