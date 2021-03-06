# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage which extends ros_base and includes ROS libaries for any robot har"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin control-msgs diagnostics executive-smach filters geometry robot-model robot-state-publisher ros-base xacro"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78d2dcf92b7b189f48b817b0548524cb"
SRC_URI[sha256sum] = "0cb38875da1568d6ffcfef3e4c48fd194a2c96908fe302274c51311021cd59b2"
S = "${WORKDIR}/metapackages-release-release-lunar-${PN}-1.3.1-0"

inherit catkin
