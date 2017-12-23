# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python ROS drivers for accessing an Axis camera's MJPG     stream. Also provides"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager-py catkin-native dynamic-reconfigure geometry-msgs message-generation message-runtime rospy sensor-msgs tf"
SRC_URI = "https://github.com/ros-drivers-gbp/axis_camera-release/archive/release/kinetic/axis_camera/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "63e87b3ab1700076e81b0f3bee5f552c"
SRC_URI[sha256sum] = "fd27759275a897bdddbfa8575ebede620e307ca57cf0bcb6dce81724f0bf0378"
S = "${WORKDIR}/axis_camera-release-release-kinetic-axis_camera-0.2.1-0"

inherit catkin
