# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Visualization configuration for SawYer roch"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher robot-state-publisher roch-description roslaunch rviz rviz-imu-plugin"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_viz-release/archive/release/kinetic/roch_viz/2.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "01fa58cbeb5d9bcc46761b4728f05bbd"
SRC_URI[sha256sum] = "3a6a0cd994f5a9974bb6581097565f0d38835fe6f44ccc0d9dec961d2254f680"
S = "${WORKDIR}/roch_viz-release-release-kinetic-roch_viz-2.0.10-0"

inherit catkin
