# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Runs an optimization to estimate the a robot's kinematic parameters. This packag"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "calibration-msgs catkin-native catkin python-matplotlib python-scipy python-orocos-kdl rospy rostest sensor-msgs urdfdom-py visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/lunar/calibration_estimation/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e65f06428694cb720c92ea8ab0d3bde5"
SRC_URI[sha256sum] = "10787a8f39bae48c854bdd1941bc49f23dc86b891c89030c952b98d426f30bb1"
S = "${WORKDIR}/calibration-release-release-lunar-calibration_estimation-0.10.14-0"

inherit catkin
