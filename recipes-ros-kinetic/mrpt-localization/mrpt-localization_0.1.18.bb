# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for robot 2D self-localization using dynamic or static (MRPT or ROS) map"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure mrpt mrpt-bridge mrpt-msgs nav-msgs pose-cov-ops roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_localization/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a55fd02639a6c67ec59796d715db659c"
SRC_URI[sha256sum] = "d51e27b97acb7571f198c4a09c945c78cf1a9eaff8ff141bedd1074d41a35757"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_localization-0.1.18-0"

inherit catkin
