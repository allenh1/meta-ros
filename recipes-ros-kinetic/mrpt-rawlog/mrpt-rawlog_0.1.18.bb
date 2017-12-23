# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package enables you to record a rawlog from a ROS drive robot.   At the mom"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure mrpt mrpt-bridge mrpt-msgs nav-msgs roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_rawlog/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7807da9ebfc23465d7fd6e568ebe3b61"
SRC_URI[sha256sum] = "19c85a701592e781bd1133d6da30be8cd2cbe3eb42eeed61754b4d7bfa179f0b"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_rawlog-0.1.18-0"

inherit catkin
