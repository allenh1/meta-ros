# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The roch_rapps package for set of 'app manager' apps definition"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native compressed-image-transport nodelet robot-pose-publisher roch-bringup roch-follower roch-navigation roch-teleop tf topic-tools warehouse-ros world-canvas-server"
SRC_URI = "https://github.com/SawYerRobotics-release/roch-release/archive/release/kinetic/roch_rapps/2.0.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e6c88a11bbb2417eaa7b0aa76fc4e998"
SRC_URI[sha256sum] = "5294102b8ff61174379dca8f19f31c86e9497f189eff28c47c28c7496c04e90a"
S = "${WORKDIR}/roch-release-release-kinetic-roch_rapps-2.0.12-0"

inherit catkin
