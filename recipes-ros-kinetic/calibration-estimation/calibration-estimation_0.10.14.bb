# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Runs an optimization to estimate the a robot's kinematic parameters. This packag"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "calibration-msgs catkin-native python-matplotlib python-scipy python-orocos-kdl rospy rostest sensor-msgs urdfdom-py visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/calibration_estimation/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6793a5582cc79ec205dbc4eb3b3ef7e6"
SRC_URI[sha256sum] = "73ed9829ba3d29d76e91ed927415a9d8a071502162efdfb8a3aeebee500f1a40"
S = "${WORKDIR}/calibration-release-release-kinetic-calibration_estimation-0.10.14-0"

inherit catkin
