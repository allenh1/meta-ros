# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python ROS drivers for accessing an Axis camera's MJPG     stream. Also provides"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager-py catkin-native catkin dynamic-reconfigure geometry-msgs message-generation message-runtime rospy sensor-msgs tf"
SRC_URI = "https://github.com/ros-drivers-gbp/axis_camera-release/archive/release/lunar/axis_camera/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "088a9502ba5dccdb084c0bb33f392adb"
SRC_URI[sha256sum] = "765e265db8e1cc0b16a04f72c28be0da4f742a91626de69132cc5e253c46a768"
S = "${WORKDIR}/axis_camera-release-release-lunar-axis_camera-0.2.1-0"

inherit catkin
