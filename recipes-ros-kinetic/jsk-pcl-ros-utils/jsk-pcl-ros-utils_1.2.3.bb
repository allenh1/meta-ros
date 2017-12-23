# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS utility nodelets for pointcloud perception."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cv-bridge diagnostic-msgs diagnostic-updater dynamic-reconfigure eigen-conversions geometry-msgs image-geometry image-transport image-view image-view2 interactive-markers jsk-data jsk-footstep-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools kdl-conversions kdl-parser laser-assembler message-generation message-runtime moveit-core moveit-ros-perception nav-msgs nodelet octomap octomap-msgs octomap-ros octomap-server openni2-launch pcl-conversions pcl-msgs pcl-ros python-sklearn robot-self-filter rosbag rosboost-cfg roscpp-tutorials rviz sensor-msgs std-msgs std-srvs stereo-msgs tf tf2-ros tf-conversions visualization-msgs yaml-cpp"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/jsk_pcl_ros_utils/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d45b3ce2f0aea4dc21ad27c904e49979"
SRC_URI[sha256sum] = "914f72f86b75a60403eb25dd79c51335b3da5877aa68875a1044f1ce507481a6"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-jsk_pcl_ros_utils-1.2.3-0"

inherit catkin
