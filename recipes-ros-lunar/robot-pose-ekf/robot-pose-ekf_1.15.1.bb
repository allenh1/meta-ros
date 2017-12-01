# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Robot Pose EKF package is used to estimate the 3D pose of a robot, based on "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "bfl catkin-native geometry-msgs message-generation message-runtime nav-msgs roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/robot_pose_ekf/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a3bdb74edb6c23032e516dae3a36f75"
SRC_URI[sha256sum] = "ec63f777a231715b540dd59c0413e9319942ab0425230364f104df713290bf0c"
S = "${WORKDIR}/navigation-release-release-lunar-robot_pose_ekf-1.15.1-0"

inherit catkin
