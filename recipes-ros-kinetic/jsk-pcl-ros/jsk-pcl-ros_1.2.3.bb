# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS nodelets for pointcloud perception."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cv-bridge diagnostic-msgs diagnostic-updater dynamic-reconfigure eigen-conversions geometry-msgs image-geometry image-transport image-view2 interactive-markers jsk-data jsk-footstep-msgs jsk-pcl-ros-utils jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools kdl-conversions kdl-parser laser-assembler moveit-core moveit-ros-perception nav-msgs nodelet octomap octomap-msgs octomap-server openni2-launch openni-launch pcl-conversions pcl-msgs pcl-ros python-sklearn resized-image-transport robot-self-filter rosboost-cfg roscpp-tutorials sensor-msgs std-msgs std-srvs stereo-image-proc stereo-msgs tf tf2-ros tf-conversions topic-tools visualization-msgs yaml-cpp"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/jsk_pcl_ros/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "046f8590c979ce46595b7a83540a16f1"
SRC_URI[sha256sum] = "9a5a7442005dfa2070e26018088c08a51ed45e600966b9539d8446c9ec53446b"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-jsk_pcl_ros-1.2.3-0"

inherit catkin
