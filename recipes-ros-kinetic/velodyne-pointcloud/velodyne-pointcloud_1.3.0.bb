# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Point cloud conversions for Velodyne 3D LIDARs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native dynamic-reconfigure nodelet pcl-conversions pcl-ros pluginlib python-pyyaml roscpp roslaunch roslib rostest sensor-msgs tf tf2-ros velodyne-driver velodyne-laserscan velodyne-msgs yaml-cpp"
SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/kinetic/velodyne_pointcloud/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6f23a595ee88997c9f5c0daf08ab06cc"
SRC_URI[sha256sum] = "e08e27d3217739ab209b412ee67333570fb6042a241e8bf494dd9c5ca92bf86f"
S = "${WORKDIR}/velodyne-release-release-kinetic-velodyne_pointcloud-1.3.0-0"

inherit catkin
