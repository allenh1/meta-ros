# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The wiimote package allows ROS nodes to communicate with a Nintendo Wiimote     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native cwiid cwiid-dev genmsg geometry-msgs python-cwiid python-numpy roscpp roslib roslint rospy sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/lunar/${PN}/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a832ffad72b4a6200e4f19779795e41"
SRC_URI[sha256sum] = "608714c70b55a8beac6dc451700c842e58b6be45f772856b2d7e142bd05ba673"
S = "${WORKDIR}/joystick_drivers-release-release-lunar-${PN}-1.11.0-0"

inherit catkin
