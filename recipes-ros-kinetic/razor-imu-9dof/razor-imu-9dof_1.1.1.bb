# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "razor_imu_9dof is a package that provides a ROS driver      for the Sparkfun Raz"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure python-serial rospy sensor-msgs tf"
SRC_URI = "https://github.com/KristofRobot/razor_imu_9dof-release/archive/release/kinetic/razor_imu_9dof/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0935b9698336a286b910e5f3cc0997d9"
SRC_URI[sha256sum] = "9d6879f482c50ee9c634bdb408cf3668a3a7b29bdac8613e6c2735e4ad4c4541"
S = "${WORKDIR}/razor_imu_9dof-release-release-kinetic-razor_imu_9dof-1.1.1-0"

inherit catkin
