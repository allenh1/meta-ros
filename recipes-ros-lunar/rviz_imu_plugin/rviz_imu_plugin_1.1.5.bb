# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin libqt5-core libqt5-gui libqt5-widgets qtbase5-dev roscpp rviz"
SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/lunar/rviz_imu_plugin/1.1.5-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d2c2f38c32ef03b484872fe513f17dd"
SRC_URI[sha256sum] = "375e2e6832003231b28b5a9f6b04375cddf76c80f301c5b1fa0f8b3ae01deae4"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
