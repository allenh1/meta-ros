# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files for Summit XL simulation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros roslaunch summit-xl-control summit-xl-description summit-xl-pad"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_sim-release/archive/release/kinetic/summit_xl_sim_bringup/1.0.9-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7f7286a055453a155bfeae6e98da3b10"
SRC_URI[sha256sum] = "1023bcfe6f367dae0f22405bf7f171d7a9ad7f6cf0c2f22e018353e80394faff"
S = "${WORKDIR}/summit_xl_sim-release-release-kinetic-summit_xl_sim_bringup-1.0.9-2"

inherit catkin
