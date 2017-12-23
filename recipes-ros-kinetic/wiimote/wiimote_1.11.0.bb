# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The wiimote package allows ROS nodes to communicate with a Nintendo Wiimote     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native cwiid cwiid-dev genmsg geometry-msgs python-cwiid python-numpy roscpp roslib roslint rospy sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/kinetic/${PN}/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8706473c99d93c57c56fb21e3fe60453"
SRC_URI[sha256sum] = "ec122999c38ac9340c3bf3f82df9cd94ed587d95f52bec1aeb64c892cdba65cf"
S = "${WORKDIR}/joystick_drivers-release-release-kinetic-${PN}-1.11.0-0"

inherit catkin
