# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Robot Pose EKF package is used to estimate the 3D pose of a robot, based on "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=80c4ce4e9f54cd85814bf2816cd853dd"

DEPENDS = "bfl catkin geometry_msgs nav_msgs roscpp rostest sensor_msgs std_msgs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/robot_pose_ekf/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "74fbff058b2028edce9414f0cdba8a49"
SRC_URI[sha256sum] = "b68901697db54fc130e940be55099e5c369354206a561eb8ba9b26bb67696173"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
