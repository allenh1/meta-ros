# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple script to check battery status"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs rospy sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/linux_peripheral_interfaces-release/archive/release/kinetic/laptop_battery_monitor/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b0fb846d9fead56479639965e2a2f53e"
SRC_URI[sha256sum] = "eb337688407be5b0f8f30323d371dd0ab0dff36506cda1f1fd89d4b145b0693c"
S = "${WORKDIR}/linux_peripheral_interfaces-release-release-kinetic-laptop_battery_monitor-0.2.0-0"

inherit catkin
