# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Defines helper functions and routines that greatly help when trying to create a "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost calibration_msgs catkin rosconsole rostime"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/lunar/settlerlib/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "474002e2878605ae8c353f3517b557b2"
SRC_URI[sha256sum] = "44966f752699c3b7264d5c66895a660ad938707c3be647e5a0608cb3459df50a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
