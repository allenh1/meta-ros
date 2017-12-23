# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides Gazebo plugins to simulate the Katana arm."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib catkin-native control-msgs control-toolbox gazebo-ros katana-msgs sensor-msgs trajectory-msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/kinetic/katana_gazebo_plugins/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ea71a51d0f620a57ffefe5ff51fa116d"
SRC_URI[sha256sum] = "734a02bff32ecf9ea8e2e78f8fc61d5f083dd4a3ba3153e423cf0eac662a9899"
S = "${WORKDIR}/katana_driver-release-release-kinetic-katana_gazebo_plugins-1.1.2-0"

inherit catkin
