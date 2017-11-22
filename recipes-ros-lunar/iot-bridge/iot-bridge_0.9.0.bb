# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The iot_bridge provides a bi-directional bridge between ROS and the OpenHAB Home"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin diagnostic-msgs python-requests rospy rostopic"
SRC_URI = "https://github.com/ros-gbp/iot_bridge-release/archive/release/lunar/iot_bridge/0.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9399097447739ab9e74e4f132bb8b2db"
SRC_URI[sha256sum] = "9e293064bf23b991adadca2795c3bcd32e14faa210bb45e2852d6337d2cac1de"
S = "${WORKDIR}/iot_bridge-release-release-lunar-iot_bridge-0.9.0-0"

inherit catkin
